package io.bidmachine.iab.mraid;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import com.ironsource.sdk.controller.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class MraidUtils {

    @NonNull
    public static final String ARG_OPEN_PRIVACY_SHEET_DATA = "data";

    @NonNull
    public static final String COMMAND_URL_PREFIX = "mraid://";
    public static final int DEFAULT_CLOSE_TIME_SEC = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f69272d;
    public static final long MAX_ON_SCREEN_TIME_MS = TimeUnit.SECONDS.toMillis(30);

    @NonNull
    public static final String COMMAND_OPEN_PRIVACY_SHEET = "openPrivacySheet";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f69269a = Arrays.asList("close", "expand", "open", "playVideo", "resize", MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "setResizeProperties", "useCustomClose", "noFill", C3978d4.i.f31359r, "AdStarted", "AdStopped", "AdSkipped", "AdSkippableStateChange", "AdVideoStart", "AdVideoFirstQuartile", "AdVideoMidpoint", "AdVideoThirdQuartile", "AdVideoComplete", "AdUserClose", "AdPaused", "AdPlaying", "AdClickThru", "AdLog", "AdError", "createCalendarEvent", "storePicture", COMMAND_OPEN_PRIVACY_SHEET);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f69270b = {'\"', '\''};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final MraidJsValidator f69271c = new b();

    public static class b implements MraidJsValidator {
        private b() {
        }

        @Override // io.bidmachine.iab.mraid.MraidJsValidator
        public boolean checkParamsForCommand(String str, Map map) {
            return MraidUtils.b(str, map);
        }

        @Override // io.bidmachine.iab.mraid.MraidJsValidator
        public boolean isValidCommand(String str) {
            return MraidUtils.b(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidJsValidator
        public String removePrefix(String str) {
            return str.substring(8);
        }
    }

    public static int a(String str, String str2, List list) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (list == null) {
                list = a(str, f69270b);
            }
            Matcher matcher = Pattern.compile(String.format("<%s[^>]*>", str2), 2).matcher(str);
            while (matcher.find()) {
                int iEnd = matcher.end();
                if (a(iEnd, list)) {
                    return iEnd;
                }
            }
        }
        return -1;
    }

    public static String a() {
        return "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\" /><style>body { margin:0; padding:0;}*:not(input) { -webkit-touch-callout:none; -webkit-user-select:none; -webkit-text-size-adjust:none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); }</style>";
    }

    public static List a(String str, char... cArr) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && cArr != null) {
            try {
                int[] iArr = new int[cArr.length];
                Arrays.fill(iArr, -1);
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= cArr.length) {
                            break;
                        }
                        if (cCharAt == cArr[i11]) {
                            int i12 = iArr[i11];
                            if (i12 > -1) {
                                arrayList.add(new Pair(Integer.valueOf(i12), Integer.valueOf(i10)));
                                iArr[i11] = -1;
                            } else {
                                iArr[i11] = i10;
                            }
                        } else {
                            i11++;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static void a(StringBuffer stringBuffer) {
        int iA;
        if (!TextUtils.isEmpty(stringBuffer) && (iA = a(stringBuffer.toString(), "head", null)) > -1) {
            stringBuffer.insert(iA, a());
        }
    }

    private static boolean a(int i10, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (i10 >= ((Integer) pair.first).intValue() && i10 <= ((Integer) pair.second).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static String b() {
        if (f69272d == null) {
            f69272d = new String(Base64.decode(MraidJs.JS, 0)).replace("%%VERSION%%", "");
        }
        return f69272d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        return f69269a.contains(str);
    }

    private static boolean b(String str, String str2, List list) {
        return a(str, str2, list) > -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, Map map) {
        String str2;
        str.hashCode();
        switch (str) {
            case "playVideo":
            case "open":
            case "storePicture":
                str2 = "url";
                break;
            case "openPrivacySheet":
                str2 = "data";
                break;
            case "createCalendarEvent":
                str2 = "eventJSON";
                break;
            case "setOrientationProperties":
                return map.containsKey("allowOrientationChange") && map.containsKey("forceOrientation");
            case "setResizeProperties":
                return map.containsKey("width") && map.containsKey("height") && map.containsKey("offsetX") && map.containsKey("offsetY") && map.containsKey("customClosePosition") && map.containsKey("allowOffscreen");
            case "useCustomClose":
                return map.containsKey("useCustomClose");
            default:
                return true;
        }
        return map.containsKey(str2);
    }

    @Nullable
    public static View getRootViewFromActivity(@Nullable Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    @Nullable
    public static View getRootViewFromView(@Nullable View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }

    @Nullable
    public static View getTopmostView(@Nullable Context context, @Nullable View view) {
        View rootViewFromActivity = getRootViewFromActivity(context);
        return rootViewFromActivity != null ? rootViewFromActivity : getRootViewFromView(view);
    }

    @NonNull
    public static View obtainRootView(@NonNull Context context, @NonNull View view) {
        View topmostView = getTopmostView(context, view);
        return topmostView instanceof ViewGroup ? (ViewGroup) topmostView : view;
    }

    @Nullable
    public static Map<String, String> parseCommandUrl(@NonNull String str) {
        return parseCommandUrl(str, f69271c);
    }

    @Nullable
    public static Map<String, String> parseCommandUrl(@NonNull String str, @NonNull MraidJsValidator mraidJsValidator) {
        MraidLog.d("parseCommandUrl", str, new Object[0]);
        String strRemovePrefix = mraidJsValidator.removePrefix(str);
        HashMap map = new HashMap();
        int iIndexOf = strRemovePrefix.indexOf(63);
        if (iIndexOf != -1) {
            String strSubstring = strRemovePrefix.substring(0, iIndexOf);
            for (String str2 : strRemovePrefix.substring(iIndexOf + 1).split(C3978d4.j.f31381c)) {
                int iIndexOf2 = str2.indexOf(61);
                map.put(str2.substring(0, iIndexOf2), str2.substring(iIndexOf2 + 1));
            }
            strRemovePrefix = strSubstring;
        }
        if (!mraidJsValidator.isValidCommand(strRemovePrefix)) {
            MraidLog.w(f.b.f33720g, "%s is unknown", strRemovePrefix);
            return null;
        }
        if (!mraidJsValidator.checkParamsForCommand(strRemovePrefix, map)) {
            MraidLog.w(f.b.f33720g, "URL %s is missing parameters", str);
            return null;
        }
        HashMap map2 = new HashMap();
        map2.put(f.b.f33720g, strRemovePrefix);
        map2.putAll(map);
        return map2;
    }

    @NonNull
    public static String processRawHtml(@NonNull String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        List listA = a(str, f69270b);
        boolean zB = b(str, CreativeInfo.f52467al, listA);
        boolean zB2 = b(str, "head", listA);
        boolean zB3 = b(str, "body", listA);
        if ((!zB && (zB2 || zB3)) || (zB && !zB3)) {
            return str;
        }
        if (!zB) {
            stringBuffer.insert(0, "<html><head></head><body><div align=\"center\">");
            stringBuffer.append("</div></body></html>");
        } else if (!zB2) {
            Matcher matcher = Pattern.compile("<html[^>]*>", 2).matcher(stringBuffer);
            for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
                stringBuffer.insert(matcher.end(), "<head></head>");
            }
        }
        a(stringBuffer);
        return stringBuffer.toString();
    }
}
