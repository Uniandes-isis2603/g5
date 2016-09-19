(function (ng) {

    var mod = ng.module("mainApp", [
        // External dependencies
        'ui.router',
        'ui.bootstrap',
        // Internal modules dependencies
        "bibliotecasModule",
        "usuariosModule",
        "videosModule",
        "librosModule",
        "salasModule",
        "reservasModule",
        "blogsModule",
        "prestamosModule",
         
        "ngMessages"
    ]);

    mod.config(['$logProvider', function ($logProvider) {
            $logProvider.debugEnabled(true);
        }]);

    mod.config(['$urlRouterProvider', function ($urlRouterProvider) {
           $urlRouterProvider.otherwise('/bibliotecasList');
           $urlRouterProvider.otherwise('/librosList');
           $urlRouterProvider.otherwise('/videosList');
           $urlRouterProvider.otherwise('/reservasList');
           $urlRouterProvider.otherwise('/usuariosList');
           $urlRouterProvider.otherwise('/salasList');

           $urlRouterProvider.otherwise('/');



        }]);
  
})(window.angular);


