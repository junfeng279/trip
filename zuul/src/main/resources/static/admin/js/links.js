
var links = Vue.component('app-links', function(resolve, reject){
    $.get("../../templates/admin/links.html").then(function(res){
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