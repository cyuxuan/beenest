/**
 * MIT License
 * <p>
 * Copyright (c) 2022 beenest.club
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package club.beenest.security.sso.authcode;

import club.beenest.security.sso.service.authcode.AuthCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证码获取
 *
 * @author 陈玉轩
 */
@RestController
public class AuthCodeController {
    private final AuthCodeService authCodeService;

    /**
     * 生成并返回验证码
     *
     * @return 返回验证验证码
     */
    @PostMapping("/getAuthCode")
    public String getAuthCode(String userAccount) {
        return this.authCodeService.getAuthCode(userAccount);
    }

    /**
     * 使用 构造器注入
     *
     * @param authCodeService 验证码服务
     */
    @Autowired
    public AuthCodeController(AuthCodeService authCodeService) {
        this.authCodeService = authCodeService;
    }
}
