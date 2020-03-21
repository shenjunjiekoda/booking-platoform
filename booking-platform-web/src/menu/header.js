// 菜单 顶栏
export default [
  { path: '/index', title: '首页', icon: 'home' },
  {
    path: '/plan',
    title: '发布计划',
    icon: 'paper-plane-o'
  },
  {
    title: '统计',
    icon: 'signal',
    children: [
      { path: '/operationlog', icon: 'pencil-square-o', title: '操作日志' },
      { path: '/report', title: '发布报表' }
    ]
  },
  {
    path: '/book',
    title: '书库',
    icon: 'diamond'
  }
]
