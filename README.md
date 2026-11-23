# ff4s-shoelace

Experimental [ff4s](https://github.com/buntec/ff4s) bindings for the wonderful [Shoelace](https://shoelace.style/) web components.

This is a minor adaptation of [laminar-shoelace-components](https://github.com/raquo/laminar-shoelace-components).
All credit is due to the amazing @raquo.

```scala
libraryDependencies += "io.github.buntec" %%% "ff4s-shoelace" % "0.0.1"
```

The bindings are generated from Shoelace 2.20.1. They don't include Shoelace itself,
so load its JavaScript and a theme in your page, e.g. from a CDN:

```html
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@shoelace-style/shoelace@2.20.1/cdn/themes/light.css" />
<script type="module" src="https://cdn.jsdelivr.net/npm/@shoelace-style/shoelace@2.20.1/cdn/shoelace-autoloader.js"></script>
```

## Development

The recipes in the [justfile](justfile) need [just](https://github.com/casey/just), sbt, Node.js and Python 3.

- `just install`: install the npm dependencies (Shoelace for the generator, jsdom for the tests)
- `just generate`: regenerate the bindings in `ff4s-shoelace/src/main/scala` from `node_modules/@shoelace-style/shoelace`.
  CI checks that the committed sources are up to date.
- `just test [scala]`: run the test suite in jsdom, e.g. `just test 2.13`
- `just link-examples [scala]` (or `just watch-examples [scala]`), then `just serve-examples`: serve the examples at http://127.0.0.1:8080/

To move to a newer Shoelace, update `@shoelace-style/shoelace` in `package.json`,
run `npm install` and `just generate`, and bump the CDN links in `examples/index.html`.
