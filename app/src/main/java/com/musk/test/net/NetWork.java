package com.musk.test.net;

/**
    http的存储会话机制
 */
public class NetWork {

    /*
    cookie:存储在客户端，用来标识客户端身份，有临时[存储在内存中超时清理]和持续的[存储在磁盘中]，服务器响应头中Set-Cookie
            缺点：存储大小限制４k，对用户可见可随意修改，不安全
    session:存储在服务器，保证安全，是服务器在客户端连接时添加的连接标志，用来解决2次http请求的关联
    token：令牌，用于用户身份验证避免多次查库，由uid+time+sign组成
           其中sign中由token的前几位+盐以哈希算法压缩成一定长的十六进制字符串，可以防止恶意第三方拼接token请求服务器
     */
    public static void doTest(){

    }
    /*
        git项目配置
     */
}