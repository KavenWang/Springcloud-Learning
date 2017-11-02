(function () {
    'use strict';

    angular
        .module('kmsgatewayserverApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
