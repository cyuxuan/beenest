package club.beenest.security.sso.service.authcode.impl;

import club.beenest.security.sso.service.authcode.AuthCodeService;
import org.springframework.stereotype.Service;

/**
 * 验证码服务具体实现
 */
@Service
public class AuthCodeServiceImpl implements AuthCodeService {
    @Override
    public String getAuthCode(String userAccount) {
        // 生成验证码
        StringBuilder sb = new StringBuilder();
        // 随机生成6个数字
        for (int i = 0; i < 6; i++) {
            String partCode = String.valueOf((int) (Math.random() * 10));
            sb.append(partCode);
        }
        return sb.toString();
    }
}
