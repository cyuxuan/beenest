package club.beenest.security.sso.service.authcode;

/**
 * 验证码服务
 * 定义验证码相关服务接口
 *
 * @author 陈玉轩
 * @since 1.0
 */
public interface AuthCodeService {
    /**
     * 获取验证码
     * 验证码为6位，发送至邮箱
     *
     * @param userAccount 用户账号
     * @return 生成的6位账号
     * @since 1.0
     */
    String getAuthCode(String userAccount);
}
