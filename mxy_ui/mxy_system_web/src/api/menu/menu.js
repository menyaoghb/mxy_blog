import request from '@/utils/request'

/*列表查询*/
export function getSysMenuList(data) {
  return request({
    url: '/sysMenu/getList',
    method: 'post',
    data
  })
}

/*新增*/
export function addMenu(data) {
  return request({
    url: '/sysMenu/add',
    method: 'post',
    data
  })
}

/*修改*/
export function editMenu(data) {
  return request({
    url: '/sysMenu/edit',
    method: 'post',
    data
  })
}

/*删除*/
export function deleteMenu(data) {
  return request({
    url: '/sysMenu/delete',
    method: 'post',
    data
  })
}

/*菜单树数据*/
export function getTreeData() {
  return request({
    url: '/sysMenu/treeData',
    method: 'post'
  })
}
