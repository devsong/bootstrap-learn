({
    appDir: "./",
    baseUrl: ".",
    dir: "./dist",
    fileExclusionRegExp: /^(r|build)\.js$/,
    modules: [{
        name: 'main'
    }],
    optimizeCss: 'standard',
    removeCombined: true,
    paths: {
        jquery: "node_modules/jquery/dist/jquery.min",
        bootstrap: "node_modules/bootstrap/dist/js/bootstrap.min",
        // popper: "node_modules/popper.js/dist/umd/popper.min",
        index: "js/index"
    }
})