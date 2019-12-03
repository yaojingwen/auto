<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>界面自动化</title>
    <meta name="description" content="界面自动化">
    <meta name="keywords" content="界面自动化">

    <!-- Tell the browser to be responsive to screen width -->
    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/morris/morris.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/select2/select2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="header.jsp"></jsp:include>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                功能视图
                <small>CASE执行</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/index.jsp"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a
                        href="#">功能视图</a></li>

                <li class="active">CASE执行</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content"> <!-- .box-body -->
            <div class="row">
                <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-body">
                    <div class="panel panel-default">
                        <div class="row data-type">

                            <input type="hidden" name="operatorId" value="${admin.operatorId}">
                            <div class="col-md-1 title">业务模块</div>
                            <div class="col-md-5 data">
                                <input type="text" class="form-control" name="userAdmin"
                                       placeholder="业务模块" value="${admin.userAdmin}">
                            </div>
                            <div class="col-md-1 title">     用例描述</div>
                            <div class="col-md-5 data">
                                <input type="password" class="form-control" name="userPass"
                                       placeholder="用例描述" value="${admin.userPass}">
                            </div>
                            <div class="col-md-1 title">测试人员</div>
                            <input type="hidden" name="operatorId" value="${admin.operatorId}"/>
                            <div class="col-md-5 data">
                                <input type="text" class="form-control" name="userName"
                                       placeholder="测试人员" value="${admin.userName}">
                            </div>
                            <div class="col-md-1 title">菜单名称</div>
                            <div class="col-md-5 data">
                                <input type="text" class="form-control" name="userMobile"
                                       placeholder="菜单名称" value="${admin.userMobile}">
                            </div>
                            <div class="col-md-1 title">用例级别</div>
                            <div class="col-md-5 data">
                                <select class="form-control select2" style="width: 100%"
                                        name="isUsed">
                                    <c:if test="${admin.isUsed==0}">
                                        <option value="0" selected="selected">1</option>
                                        <option value="1">是</option>
                                    </c:if>
                                    <c:if test="${admin.isUsed==1}">
                                        <option value="0">否</option>
                                        <option value="1" selected="selected">2</option>
                                    </c:if>
                                    <c:if test="${admin.isUsed==null}">
                                        <option value="0">否</option>
                                        <option value="1" selected="selected">3</option>
                                    </c:if>
                                </select>
                            </div>
                            <div class="col-md-1 title">执行结果</div>
                            <div class="col-md-5 data">
                                <select class="form-control select2" style="width: 100%"
                                        name="isUsed">
                                    <c:if test="${admin.isUsed==0}">
                                        <option value="0" selected="selected">未执行</option>
                                        <option value="1">是</option>
                                    </c:if>
                                    <c:if test="${admin.isUsed==1}">
                                        <option value="0">否</option>
                                        <option value="1" selected="selected">成功</option>
                                    </c:if>
                                    <c:if test="${admin.isUsed==null}">
                                        <option value="0">否</option>
                                        <option value="1" selected="selected">失败</option>
                                    </c:if>
                                </select>
                            </div>
                        </div>
                    </div>
                    <!--工具栏-->

                    <div class="box-tools text-center">
                        <button type="button" class="btn bg-olive btn-xs"
                                onclick="history.back(-1);">查询
                        </button>
                        <button type="button" class="btn bg-olive btn-xs"
                                onclick="history.back(-1);">初始化
                        </button>
                        <button type="button" class="btn bg-olive btn-xs"
                                onclick="history.back(-1);">全量执行
                        </button>
                        <button type="button" class="btn bg-olive btn-xs"
                                onclick="history.back(-1);">过滤执行
                        </button>
                        <button type="button" class="btn bg-maroon btn-xs"
                                onclick="history.back(-1);">停止执行
                        </button>
                    </div>
                </div>
            </div>
                    <!-- 界面表格 -->


                        <%--<div class="box-tools pull-right">
                            <div class="has-feedback">
                                <input type="text" class="form-control input-sm"
                                    placeholder="搜索"> <span
                                    class="glyphicon glyphicon-search form-control-feedback"></span>
                            </div>
                        </div>--%>
                        <!--工具栏/-->
                        <!--界面列表-->
                <div class="box box-info">
                    <div class="box-header with-border">
                        <h3 class="box-title">CASE列表</h3>
                    </div>
                            <table id="dataList"
                                   class="table table-bordered table-striped table-hover dataTable">
                                <thead>
                                <tr>
                                <th class="sorting_asc">编号</th>
                                <th class="sorting">模块</th>
                                <th class="sorting">用例编码</th>
                                <th class="sorting">菜单名称</th>
                                <th class="sorting" style="
										width: 300px;">用例描述
                                </th>
                                <th class="sorting">级别</th>
                                <th class="sorting">测试人员</th>
                                <th class="sorting">执行结果</th>
                                <th class="text-center">基本操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${sysLogs}" var="syslog">
                                <tr>
                                    <td>${syslog.id}2330</td>
                                    <td>${syslog.visitTimeStr }so</td>
                                    <td>${syslog.username }34324</td>
                                    <td>${syslog.ip }菜单</td>
                                    <td style="
										width: 300px;">${syslog.url}用例描述
                                    </td>
                                    <td>${syslog.ip }高</td>>
                                    <td>${syslog.executionTime}问问</td>
                                    <td>${syslog.method}完成</td>
                                    <td class="text-center">
                                        <a href="${pageContext.request.contextPath}/发布"
                                           class="btn bg-olive btn-xs">发布</a>
                                        <a href="${pageContext.request.contextPath}/pages/zj-add.jsp"
                                           class="btn bg-olive btn-xs">详情</a>
                                        <a href="${pageContext.request.contextPath}/pages/delete"
                                           class="btn bg-maroon btn-xs">删除</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                </div>
                        <!--界面列表/-->

                    <!-- 界面表格 /-->


                <!-- /.box-body -->

                <!-- .box-footer-->
                <div class="box-footer">
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            总共2 页，共14 条界面。 每页 <select class="form-control">
                            <option>10</option>
                            <option>15</option>
                            <option>20</option>
                            <option>50</option>
                            <option>80</option>
                        </select> 条
                        </div>
                    </div>

                    <div class="box-tools pull-right">
                        <ul class="pagination">
                            <li><a href="#" aria-label="Previous">首页</a></li>
                            <li><a href="#">上一页</a></li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li><a href="#">下一页</a></li>
                            <li><a href="#" aria-label="Next">尾页</a></li>
                        </ul>
                    </div>

                </div>

                <!-- /.box-footer-->
                <%--图表--%>
                <div class="box box-success">
                    <div class="col-md-6">
                        <div id="container-bar" style="width: 600px;height: 400px"></div>
                    </div>
                    <div class="col-md-6">
                        <div id="container-pie" style="width: 600px;height: 400px"></div>
                    </div>
                    <%-- <div class="col-md-12">
                         <div id="container-bar2" style="width: 1000px;height: 400px"></div>
                     </div>--%>
                </div>

                <div class="row">
                    <div class="col-xs-12">
                        <!-- interactive chart -->
                        <div class="box box-primary">
                            <div class="box-header with-border">
                                <i class="fa fa-bar-chart-o"></i>

                                <h3 class="box-title">Interactive Area Chart</h3>

                                <div class="box-tools pull-right">
                                    Real time
                                    <div class="btn-group" id="realtime" data-toggle="btn-toggle">
                                        <button type="button" class="btn btn-default btn-xs active" data-toggle="on">
                                            On
                                        </button>
                                        <button type="button" class="btn btn-default btn-xs" data-toggle="off">Off
                                        </button>
                                    </div>
                                </div>
                            </div>
                            <div class="box-body">
                                <div id="interactive" style="height: 300px; padding: 0px; position: relative;">
                                    <canvas class="flot-base" width="1714" height="450"
                                            style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 1143px; height: 300px;"></canvas>
                                    <div class="flot-text"
                                         style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; font-size: smaller; color: rgb(84, 84, 84);">
                                        <div class="flot-x-axis flot-x1-axis xAxis x1Axis"
                                             style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; display: block;">
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 24px; text-align: center;">
                                                0
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 132px; text-align: center;">
                                                10
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 244px; text-align: center;">
                                                20
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 356px; text-align: center;">
                                                30
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 468px; text-align: center;">
                                                40
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 580px; text-align: center;">
                                                50
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 692px; text-align: center;">
                                                60
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 803px; text-align: center;">
                                                70
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 915px; text-align: center;">
                                                80
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; max-width: 103px; top: 282px; left: 1027px; text-align: center;">
                                                90
                                            </div>
                                        </div>
                                        <div class="flot-y-axis flot-y1-axis yAxis y1Axis"
                                             style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; display: block;">
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; top: 269px; left: 15px; text-align: right;">
                                                0
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; top: 215px; left: 8px; text-align: right;">
                                                20
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; top: 161px; left: 8px; text-align: right;">
                                                40
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; top: 108px; left: 8px; text-align: right;">
                                                60
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; top: 54px; left: 8px; text-align: right;">80
                                            </div>
                                            <div class="flot-tick-label tickLabel"
                                                 style="position: absolute; top: 1px; left: 1px; text-align: right;">100
                                            </div>
                                        </div>
                                    </div>
                                    <canvas class="flot-overlay" width="1714" height="450"
                                            style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 1143px; height: 300px;"></canvas>
                                </div>
                            </div>
                            <!-- /.box-body-->
                        </div>
                        <!-- /.box -->

                    </div>
                    <!-- /.col -->
                </div>
                </div>
            </div>
        </section>
        <!-- 正文区域 /-->

    </div>
    <!-- 内容区域 /-->

    <!-- 底部导航 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.8
        </div>
        <strong>Copyright &copy; 2019-2020 <a
                href="#">研究院研发部</a>.
        </strong> All rights reserved.
    </footer>
    <!-- 底部导航 /-->

</div>

<script
        src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="../plugins/chartjs/echarts.min.js"></script>
<script>
    /*图表*/
    var dom = document.getElementById("container-bar");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        title: {
            text: 'CASE分布'
        },
        legend: {
            data: ['数量']
        },
        tooltip: {},
        xAxis: {
            /*type: 'category',*/
            data: ['So', 'Ams', 'Jf', 'Ad', 'Res', 'Ord', 'Sip']
        },
        yAxis: {
            /*type: 'value'*/
        },
        series: [{
            /*itemStyle: {
                // 点的颜色。
                color: 'blue'
            },*/
            color: ['#dd6b66', '#759aa0', '#e69d87', '#8dc1a9', '#ea7e53', '#eedd78', '#73a373', '#73b9bc', '#7289ab', '#91ca8c', '#f49f42'],
            name: '数量',
            data: [330, 200, 150, 800, 50, 110, 130],
            type: 'bar'
        }]
    };
    ;
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
    var dom = document.getElementById("container-pie");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        title: {
            text: 'CASE来源',
            subtext: '纯属虚构',
            x: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['陈丕全', '唐欢', '胡亚龙', '罗炜松', '张苗']
        },
        series: [
            {
                name: 'CASE来源',
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: [
                    {value: 335, name: '罗炜松'},
                    {value: 310, name: '唐欢'},
                    {value: 234, name: '胡亚龙'},
                    {value: 135, name: '张苗'},
                    {value: 1548, name: '陈丕全'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    ;
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }

    /*  var dom = document.getElementById("container-bar2");
      var myChart = echarts.init(dom);
      var app = {};
      option = null;
      option = {
          title: {
              text: 'CASE分布'
          },
          legend: {
              data: ['数量']
          },
          tooltip: {},
          xAxis: {
              /!*type: 'category',*!/
              data: ['So', 'Ams', 'Jf', 'Ad', 'Res', 'Ord', 'Sip']
          },
          yAxis: {
              /!*type: 'value'*!/
          },
          series: [{
              /!*itemStyle: {
                  // 点的颜色。
                  color: 'blue'
              },*!/
              color: ['#dd6b66', '#759aa0', '#e69d87', '#8dc1a9', '#ea7e53', '#eedd78', '#73a373', '#73b9bc', '#7289ab', '#91ca8c', '#f49f42'],
              name: '数量',
              data: [330, 200, 150, 800, 50, 110, 130],
              type: 'bar'
          }]
      };
      ;
      if (option && typeof option === "object") {
          myChart.setOption(option, true);
      }
  */
    $(function () {
        /*
         * Flot Interactive Chart
         * -----------------------
         */
        // We use an inline data source in the example, usually data would
        // be fetched from a server
        var data = [],
            totalPoints = 100;

        function getRandomData() {

            if (data.length > 0)
                data = data.slice(1);

            // Do a random walk
            while (data.length < totalPoints) {

                var prev = data.length > 0 ? data[data.length - 1] : 50,
                    y = prev + Math.random() * 10 - 5;

                if (y < 0) {
                    y = 0;
                } else if (y > 100) {
                    y = 100;
                }

                data.push(y);
            }

            // Zip the generated y values with the x values
            var res = [];
            for (var i = 0; i < data.length; ++i) {
                res.push([i, data[i]]);
            }

            return res;
        }

        var interactive_plot = $.plot("#interactive", [getRandomData()], {
            grid: {
                borderColor: "#f3f3f3",
                borderWidth: 1,
                tickColor: "#f3f3f3"
            },
            series: {
                shadowSize: 0, // Drawing is faster without shadows
                color: "#3c8dbc"
            },
            lines: {
                fill: true, //Converts the line chart to area chart
                color: "#3c8dbc"
            },
            yaxis: {
                min: 0,
                max: 100,
                show: true
            },
            xaxis: {
                show: true
            }
        });

        var updateInterval = 500; //Fetch data ever x milliseconds
        var realtime = "on"; //If == to on then fetch data every x seconds. else stop fetching
        function update() {

            interactive_plot.setData([getRandomData()]);

            // Since the axes don't change, we don't need to call plot.setupGrid()
            interactive_plot.draw();
            if (realtime === "on")
                setTimeout(update, updateInterval);
        }

        //INITIALIZE REALTIME DATA FETCHING
        if (realtime === "on") {
            update();
        }
        //REALTIME TOGGLE
        $("#realtime .btn").click(function () {
            if ($(this).data("toggle") === "on") {
                realtime = "on";
            } else {
                realtime = "off";
            }
            update();
        });
    })
    /*
     * END INTERACTIVE CHART
     */
</script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js"></script>

<script>
    $(document).ready(function () {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document).ready(function () {

        // 激活导航位置
        setSidebarActive("order-manage");

        // 列表按钮
        $("#dataList td input[type='checkbox']").iCheck({
            checkboxClass: 'icheckbox_square-blue',
            increaseArea: '20%'
        });
        // 全选操作
        $("#selall").click(function () {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });
    });
</script>
</body>

</html>