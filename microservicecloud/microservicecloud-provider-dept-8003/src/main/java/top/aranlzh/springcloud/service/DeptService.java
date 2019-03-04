package top.aranlzh.springcloud.service;

import top.aranlzh.springcloud.entities.Dept;

import java.util.List;

/**
 * @author Aranlzh
 * @create 2019-02-27 16:07
 * @desc
 **/

public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
