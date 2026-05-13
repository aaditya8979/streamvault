package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public abstract class sn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f94889a;

    static {
        tn.x xVar = tn.x.f85368a;
        Locale locale = Locale.US;
        tn.p.j(String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI"}, 4)), "format(...)");
        String str = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"getBannerInfo", "AdPerformActionsJSI"}, 2));
        tn.p.j(str, "format(...)");
        f94889a = str;
    }

    public static String a() {
        return f94889a;
    }
}
