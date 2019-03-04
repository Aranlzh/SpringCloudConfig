package top.aranlzh.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aranlzh.springcloud.dao.DeptDao;
import top.aranlzh.springcloud.entities.Dept;
import top.aranlzh.springcloud.service.DeptService;

import java.util.List;

/**
 * @author Aranlzh
 * @create 2019-02-27 16:10
 * @desc
 **/
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
