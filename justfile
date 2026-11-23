# Serve the examples at http://127.0.0.1:8080/, reloading when the bundle is relinked
# (run `just install` and `just link-examples` or `just watch-examples` first)
serve-examples:
    npm exec vite -- examples --host 127.0.0.1 --port 8080 --strictPort

# Link the examples to examples/target/js (e.g. `just link-examples 2.13`)
link-examples scala="3":
    sbt '++ {{scala}}' examples/fastLinkJS

# Relink the examples on every source change
watch-examples scala="3":
    sbt '++ {{scala}}' '~examples/fastLinkJS'

# Install the JavaScript dependencies (Shoelace for the generator, jsdom for the tests, Vite for the examples)
install:
    npm ci

# Regenerate the component bindings from node_modules/@shoelace-style/shoelace (run `just install` first)
generate:
    sbt ff4s-shoelace/generateShoelace

# Run the test suite in jsdom (e.g. `just test 2.13`; run `just install` first)
test scala="3":
    sbt '++ {{scala}}' ff4s-shoelace/test
