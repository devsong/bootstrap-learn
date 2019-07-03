require.config({
    baseUrl: ".",
    paths: {
        jquery: "node_modules/jquery/dist/jquery.min",
        bootstrap: "node_modules/bootstrap/dist/js/bootstrap.min",
        popper: "node_modules/popper.js/dist/umd/popper.min",
        index: "js/index"
    },
    shim: {
        'bootstrap': ['jquery']
    },
    map: {
        '*': {
            'popper.js': 'popper'
        }
    }
});

require(["jquery", "index"], function ($, index) {
    $('#btn').click(function (e) {
        console.log('module:' + index.moduleName + ',version:' + index.version);
        index.showMessage('hello world');
    });
});