package top.aranlzh.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import top.aranlzh.springcloud.entities.Dept;

import java.util.List;

/**
 * @author Aranlzh
 * @create 2019-02-27 15:45
 * @desc
 **/
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
