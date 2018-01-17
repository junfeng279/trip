<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="col-sm-12">
                    <h4 class="page-title">系统设置</h4>
                </div>
                <div class="col-md-6">
                    <div class="panel panel-color panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">全局设置</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label class="col-md-3 control-label">站点名称</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" placeholder="站点名称" required="required" aria-required="true" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">站点描述</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" placeholder="站点描述" required="required" aria-required="true">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">ICP备案号</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" placeholder="ICP备案号" required="required" aria-required="true">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">博客主题</label>
                                    <div class="col-md-9">
                                        <select class="form-control">
                                            <option value="default">默认主题</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="clearfix pull-right">
                                    <button type="button" class="btn btn-primary waves-light waves-effect">保存设置</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="panel panel-color panel-inverse">
                        <div class="panel-heading">
                            <h3 class="panel-title">个性化设置</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label class="col-md-3 control-label">微博账号</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" placeholder="微博账号， 不输入则不显示"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">知乎账号</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" placeholder="知乎账号， 不输入则不显示"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">Github账号</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" placeholder="Github账号， 不输入则不显示"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">Twitter账号</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" placeholder="Twitter账号， 不输入则不显示"/>
                                    </div>
                                </div>
                                <div class="clearfix pull-right">
                                    <button type="button" class="btn btn-inverse waves-effect waves-light">保存设置</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
                <div class="col-md-9">
                    <div class="panel panel-color panel-success">
                        <div class="panel-heading">
                            <div class="panel-title">
                                <h3 class="panel-title">系统备份</h3>
                            </div>
                        </div>
                        <div class="panel-body">
                            <form class="form-inline" role="form">
                                <div class="form-group col-md-6">
                                    <input type="text" class="form-control" style="width: 100%;" placeholder="请输入备份存放路径"/>
                                </div>
                                <button class="btn btn-success waves-effect waves-light m-l-10">备份文件</button>
                                <button class="btn btn-danger waves-effect waves-light m-l-10">导出数据库SQL</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    export default {
        name: 'System',
        data: function () {
            return {
            };
        }
    };
</script>
<style>
    @import "../../static/css/bootstrap.css";
    @import "../../static/css/font-awesome.css";
    @import "../../static/css/style.min.css";
</style>
