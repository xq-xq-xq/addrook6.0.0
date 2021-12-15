package cn.ekgc.addrook.dao;

import cn.ekgc.addrook.pojo.entity.Addrook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <b>个人通讯录系统 - 数据持久层接口</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 20:14
 * @program: addrook6.0.0
 **/
@Repository("addrookDao")
public interface AddrookDao extends BaseMapper<Addrook> {

}
