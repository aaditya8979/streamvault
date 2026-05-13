package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.mapping.b;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WindVaneSignalCommunication.java */
/* JADX INFO: loaded from: classes2.dex */
public class h implements b, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pattern f38939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38940b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f38942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WindVaneWebView f38943e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38941c = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f38944f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.f38942d = context;
    }

    public void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f38944f.sendMessage(messageObtain);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f38943e = windVaneWebView;
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f38913b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f38915d);
        if (jsObject == null) {
            return;
        }
        try {
            b.C0471b c0471bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f38942d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f38916e, Object.class, String.class);
            c0471bA.a();
            if (jsObject instanceof g) {
                aVar.f38912a = c0471bA;
                aVar.f38914c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    public void a(Pattern pattern) {
        this.f38939a = pattern;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f38943e, str);
        if (aVarA != null) {
            aVarA.f38913b = this.f38943e;
            return aVarA;
        }
        Matcher matcher = this.f38939a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f38917f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f38915d = matcher.group(1);
                aVar.f38918g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f38916e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f38814k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f38916e = com.mbridge.msdk.mbsignalcommon.base.e.f38814k.get(aVar.f38916e);
                }
                aVar.f38913b = this.f38943e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.f38940b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = aVar.f38914c;
                b.C0471b c0471b = aVar.f38912a;
                if (c0471b != null && obj != null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = aVar;
                    objArr[1] = TextUtils.isEmpty(aVar.f38917f) ? JsonUtils.EMPTY_JSON : aVar.f38917f;
                    c0471b.a(obj, objArr);
                }
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }
}
