package com.jiakuanhu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    public Dept(String dname) {
        this.dname = dname;
    }

    // 主键
    private Long deptno;

    // 部门名称
    private String dname;

    /** 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库 */
    private String db_source;

    // public static void main(String[] args) {
    // Dept d = new Dept();
    // d.setDname("皎月不").setDeptno(12121212L).setDb_source("banjiank");
    // System.out.println(d);
    // }

}
