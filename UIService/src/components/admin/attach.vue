<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">文件管理</h4>
                    </div>
                    <div class="row">
                        <div class="col-md-12 portlets">
                            <div class="m-b-30">
                                <vue-dropzone ref="myVueDropzone" id="dropzone" :options="dropzoneOptions"></vue-dropzone>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12 attach">
                        <div class="col-md-2 text-center m-t-10">
                            <a href="#">
                                <img src="../../static/images/attach.png">
                            </a>
                            <div class="clearfix m-t-10">
                                <span class="attach-text" data-toggle="tooltip" data-placement="top">
                                    附件名称
                                </span>
                            </div>
                            <div class="clearfix m-t-10">
                                <button type="button" class="btn btn-warning btn-sm waves-effect waves-light m-t-5 copy">
                                    <i class="fa fa-copy"></i><span> 复制</span>
                                </button>
                                <button type="button" class="btn btn-danger btn-sm waves-effect waves-light m-t-5 copy">
                                    <i class="fa fa-trash-o"></i><span> 删除</span>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import vue2Dropzone from 'vue2-dropzone';
    import 'vue2-dropzone/dist/vue2Dropzone.css';
    export default {
        name: 'Attach',
        data: function () {
            return {
                dropzoneOptions: {
                    url: 'https://httpbin.org/post',
                    thumbnailWidth: 150,
                    maxFilesize: 0.5,
                    headers: {'My-Awesome-Header': 'header value'}
                }
            };
        },
        components: {
            vueDropzone: vue2Dropzone
        },
    };
</script>
<style>
    @import "../../static/css/bootstrap.css";
    @import "../../static/css/font-awesome.css";
    @import "../../static/css/style.min.css";
</style>
