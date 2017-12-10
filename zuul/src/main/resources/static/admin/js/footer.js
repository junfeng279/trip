
var footer = Vue.component('app-footer', function(resolve, reject){
    $.get("../../templates/admin/footer.html").then(function(res){
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