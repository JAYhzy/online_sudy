# 项目说明

## 仓库定位

本仓库是本科毕业设计项目 `online_sudy` 的整理版，项目方向为在线学习 / 后台管理类前后端分离系统。

## 技术栈

- 后端：Spring Boot、Maven、MyBatis-Plus、MySQL
- 前端：Vue 2、Vue Router、Element UI、Axios、ECharts
- 项目形态：前后端分离 Web 应用

## 内容结构

- `src/`：Spring Boot 后端源码。
- `vue/`：Vue 前端源码。
- `sql/`：数据库脚本。
- `pom.xml`：后端 Maven 配置。

## 功能模块

- 登录注册
- 用户与权限管理
- 菜单 / 角色管理
- 课程、文章、评论等业务模块
- 文件上传
- 图表展示
- 前台页面与后台管理页面

## 运行说明

后端运行步骤：

1. 安装 JDK、Maven 和 MySQL。
2. 创建数据库并导入 `sql/` 目录中的脚本。
3. 修改后端配置文件中的数据库连接信息。
4. 使用 IDE 打开项目或执行 Maven 命令启动 Spring Boot。

前端运行步骤：

1. 进入 `vue/` 目录。
2. 执行 `npm install` 安装依赖。
3. 执行 `npm run serve` 启动前端项目。
4. 确认前端接口地址与后端服务端口一致。

## 整理说明

本仓库默认分支 `main` 是清洗后的毕设展示版，已过滤学习笔记、`target`、`node_modules`、IDE 配置、编译产物和临时文件。
