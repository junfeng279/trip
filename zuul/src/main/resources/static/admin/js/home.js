
var home = Vue.component('app-home', function(resolve, reject){
    $.get("../../templates/admin/home.html").then(function(res){
        resolve({
            template: res,
            data: function(){
                return {
                }
            },
            methods: {

            }
        });
    });
});