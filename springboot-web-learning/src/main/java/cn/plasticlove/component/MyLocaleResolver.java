package cn.plasticlove.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/25-20:37
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        Locale locale = Locale.getDefault();
        String lg = request.getParameter("lg");
        if (!StringUtils.isEmpty(lg)){
            String[] lgs = lg.split("_");

            locale = new Locale(lgs[0],lgs[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
