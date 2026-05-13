package vc;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.UpdateEvent;
import com.mgs.carparking.ui.mine.feedback.FeedbackActivity;
import com.safedk.android.utils.Logger;
import ed.l0;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import me.goldze.mvvmhabit.base.BaseApplication;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: compiled from: UpdateUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f85970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bm.b f85971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f85972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f85973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f85974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f85975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f85976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f85977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f85978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f85979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f85980k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Dialog f85984o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f85981l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f85982m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f85983n = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85985p = false;

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class a implements xl.r<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public bm.b f85986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f85987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f85988d;

        /* JADX INFO: renamed from: vc.j0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: UpdateUtil.java */
        public class C1079a extends ClickableSpan {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f85990b;

            public C1079a(String str) {
                this.f85990b = str;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(@NonNull View view) {
                ed.a.a(a.this.f85988d, this.f85990b);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NonNull TextPaint textPaint) {
                textPaint.setColor(Color.parseColor("#365899"));
                textPaint.setUnderlineText(false);
            }
        }

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class b implements View.OnClickListener {
            public b() {
            }

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (intent == null) {
                    return;
                }
                context.startActivity(intent);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(a.this.f85988d, (Class<?>) FeedbackActivity.class);
                intent.putExtra("flag", 2);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(a.this.f85988d, intent);
            }
        }

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j0.this.f85984o.dismiss();
            }
        }

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class d implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateEvent f85994b;

            public d(UpdateEvent updateEvent) {
                this.f85994b = updateEvent;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ed.e.q()) {
                    return;
                }
                j0.this.E(this.f85994b.getResult().getUrl(), this.f85994b.getResult().getForce_upgrade());
            }
        }

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class e implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateEvent f85996b;

            public e(UpdateEvent updateEvent) {
                this.f85996b = updateEvent;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ed.e.q()) {
                    return;
                }
                j0.this.E(this.f85996b.getResult().getUrl(), this.f85996b.getResult().getForce_upgrade());
            }
        }

        public a(boolean z10, Context context) {
            this.f85987c = z10;
            this.f85988d = context;
        }

        @Override // xl.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            Log.i("wangyi", "result：" + str);
            String strA = zp.a.a(str);
            if (this.f85987c && zp.o.b(strA)) {
                zp.p.b(zp.r.b().getResources().getString(R.string.str_new_version));
                return;
            }
            try {
                int i10 = this.f85988d.getPackageManager().getPackageInfo(this.f85988d.getPackageName(), 0).versionCode;
                if (ed.k.e(strA, UpdateEvent.class)) {
                    UpdateEvent updateEvent = (UpdateEvent) ed.k.b(strA, UpdateEvent.class);
                    Log.i("wangyi", "版本号为：" + i10);
                    Log.i("wangyi", "信息为：" + strA.toString() + "---" + updateEvent.getResult());
                    if (updateEvent.getCode() != 10000 || updateEvent.getResult() == null) {
                        if (this.f85987c) {
                            zp.p.b(zp.r.b().getResources().getString(R.string.str_version_isnew));
                            return;
                        } else {
                            op.a.a().b(new ic.g());
                            op.a.a().b(new ic.u());
                            return;
                        }
                    }
                    if (updateEvent.getResult().getVersion() <= 40000) {
                        if (this.f85987c) {
                            zp.p.b(zp.r.b().getResources().getString(R.string.str_version_isnew));
                            return;
                        } else {
                            op.a.a().b(new ic.u());
                            return;
                        }
                    }
                    View viewInflate = LayoutInflater.from(this.f85988d).inflate(R.layout.pop_layout_update, (ViewGroup) null);
                    j0.this.f85972c = (ProgressBar) viewInflate.findViewById(R.id.progress);
                    j0.this.f85974e = (TextView) viewInflate.findViewById(R.id.tv_title);
                    j0.this.f85975f = (TextView) viewInflate.findViewById(R.id.tv_content);
                    j0.this.f85977h = (TextView) viewInflate.findViewById(R.id.upgrade);
                    j0.this.f85976g = (TextView) viewInflate.findViewById(R.id.tv_cancel);
                    j0.this.f85973d = (TextView) viewInflate.findViewById(R.id.tv_progress_num);
                    j0.this.f85980k = (LinearLayout) viewInflate.findViewById(R.id.ll_bottom);
                    j0.this.f85978i = (TextView) viewInflate.findViewById(R.id.tv_update);
                    j0.this.f85979j = (TextView) viewInflate.findViewById(R.id.tv_feedback);
                    j0.this.f85974e.setText(zp.r.b().getResources().getString(R.string.str_update) + "\n" + updateEvent.getResult().getVersion_name());
                    j0.this.f85975f.setMovementMethod(LinkMovementMethod.getInstance());
                    if (updateEvent.getResult().getForce_upgrade() == 1) {
                        j0.this.f85980k.setVisibility(8);
                        j0.this.f85978i.setVisibility(0);
                    } else {
                        j0.this.f85980k.setVisibility(0);
                        j0.this.f85978i.setVisibility(8);
                    }
                    String str2 = "";
                    if (!zp.o.b(updateEvent.getResult().getText())) {
                        for (String str3 : updateEvent.getResult().getText().split("/n")) {
                            str2 = str2 + "\n" + str3;
                        }
                    }
                    if (!zp.o.b(str2)) {
                        Matcher matcher = Pattern.compile("(http://|https://).+./").matcher(str2);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        if (matcher.find()) {
                            spannableStringBuilder.setSpan(new C1079a(matcher.group()), str2.indexOf("http"), str2.lastIndexOf("/") + 1, 33);
                            j0.this.f85975f.setText(spannableStringBuilder);
                        } else {
                            j0.this.f85975f.setText(spannableStringBuilder);
                        }
                    }
                    j0.this.f85984o = sd.h.b(this.f85988d, viewInflate, true);
                    j0.this.f85984o.setCanceledOnTouchOutside(false);
                    j0.this.f85984o.setCancelable(false);
                    j0.this.f85984o.show();
                    j0.this.f85979j.setOnClickListener(new b());
                    j0.this.f85976g.setOnClickListener(new c());
                    j0.this.f85978i.setOnClickListener(new d(updateEvent));
                    j0.this.f85977h.setOnClickListener(new e(updateEvent));
                }
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
            }
        }

        @Override // xl.r
        public void onComplete() {
        }

        @Override // xl.r
        public void onError(Throwable th2) {
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            this.f85986b = bVar;
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class b implements xl.n<String> {

        /* JADX INFO: compiled from: UpdateUtil.java */
        public class a implements Callback {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ xl.m f85999b;

            public a(xl.m mVar) {
                this.f85999b = mVar;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Log.i("wangyi", "fail：" + call.toString());
                this.f85999b.onError(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                Log.i("wangyi", "sucess：" + response.toString());
                if (response.body() != null) {
                    this.f85999b.onNext(response.body().string());
                }
            }
        }

        public b() {
        }

        @Override // xl.n
        public void subscribe(xl.m<String> mVar) throws Exception {
            String str;
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            if (zp.o.b(l0.p())) {
                str = yb.b.b() + "api/public/upgrade";
            } else {
                str = l0.p() + "api/public/upgrade";
            }
            MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Request requestBuild = new Request.Builder().addHeader("app_id", "filmin").addHeader("version", "40000").addHeader("sys_platform", "2").addHeader("mob_mfr", Build.MANUFACTURER.toLowerCase()).addHeader("mobmodel", Build.MODEL).addHeader("sysrelease", Build.VERSION.RELEASE).addHeader("device_id", ec.a.a(zp.r.b())).addHeader("channel_code", ed.e.f(BaseApplication.getInstance())).addHeader("cur_time", jCurrentTimeMillis + "").addHeader("token", l0.R()).addHeader("sign", ed.e.x(ed.e.y(jCurrentTimeMillis + "")).toUpperCase()).post(RequestBody.create(mediaType, "")).url(str).build();
            builder.sslSocketFactory(c0.a(), c0.c()).hostnameVerifier(new g(null));
            builder.build().newCall(requestBuild).enqueue(new a(mVar));
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class c implements xl.r<Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f86001b;

        public c(int i10) {
            this.f86001b = i10;
        }

        @Override // xl.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Integer num) {
            j0.this.f85972c.setProgress(num.intValue());
            j0.this.f85973d.setText(num + "/100");
            if (num.intValue() == 100) {
                if (this.f86001b == 1) {
                    j0.this.f85978i.setVisibility(0);
                } else {
                    j0.this.f85980k.setVisibility(0);
                }
                j0.this.f85972c.setVisibility(8);
                j0.this.f85973d.setVisibility(8);
                j0.this.f85977h.setEnabled(true);
                j0.this.f85978i.setEnabled(true);
            }
        }

        @Override // xl.r
        public void onComplete() {
            zp.p.b(zp.r.b().getResources().getString(R.string.str_download_tfail));
            if (this.f86001b == 1) {
                j0.this.f85978i.setVisibility(0);
            } else {
                j0.this.f85980k.setVisibility(0);
            }
            j0.this.f85972c.setVisibility(8);
            j0.this.f85973d.setVisibility(8);
            j0.this.f85977h.setEnabled(true);
            j0.this.f85978i.setEnabled(true);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            zp.p.b(zp.r.b().getResources().getString(R.string.str_download_tfail));
            if (this.f86001b == 1) {
                j0.this.f85978i.setVisibility(0);
            } else {
                j0.this.f85980k.setVisibility(0);
            }
            j0.this.f85972c.setVisibility(8);
            j0.this.f85973d.setVisibility(8);
            j0.this.f85977h.setEnabled(true);
            j0.this.f85978i.setEnabled(true);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            j0.this.f85971b = bVar;
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class d implements xl.n<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f86003a;

        public d(String str) {
            this.f86003a = str;
        }

        @Override // xl.n
        public void subscribe(xl.m<Integer> mVar) throws Exception {
            j0.this.F(this.f86003a, mVar);
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class e implements Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f86005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xl.m f86006c;

        public e(String str, xl.m mVar) {
            this.f86005b = str;
            this.f86006c = mVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            j0.this.C(this.f86005b, this.f86006c);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #4 {Exception -> 0x0096, blocks: (B:38:0x0092, B:42:0x009a), top: B:46:0x0092 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // okhttp3.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onResponse(okhttp3.Call r11, okhttp3.Response r12) throws java.lang.Throwable {
            /*
                r10 = this;
                r11 = 2048(0x800, float:2.87E-42)
                byte[] r11 = new byte[r11]
                r0 = 0
                okhttp3.ResponseBody r1 = r12.body()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
                java.io.InputStream r1 = r1.byteStream()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
                vc.j0 r2 = vc.j0.this     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
                java.io.File r2 = vc.j0.g(r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
                r3.<init>(r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
                okhttp3.ResponseBody r12 = r12.body()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                long r4 = r12.getContentLength()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                vc.j0 r12 = vc.j0.this     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                vc.j0.i(r12, r4)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                r6 = 0
            L27:
                int r12 = r1.read(r11)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                r0 = -1
                if (r12 == r0) goto L4d
                r0 = 0
                r3.write(r11, r0, r12)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                long r8 = (long) r12     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                long r6 = r6 + r8
                float r12 = (float) r6     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                r0 = 1065353216(0x3f800000, float:1.0)
                float r12 = r12 * r0
                float r0 = (float) r4     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                float r12 = r12 / r0
                r0 = 1120403456(0x42c80000, float:100.0)
                float r12 = r12 * r0
                int r12 = (int) r12     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                xl.m r0 = r10.f86006c     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                r0.onNext(r12)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                vc.j0 r12 = vc.j0.this     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                vc.j0.k(r12, r6)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                goto L27
            L4d:
                r3.flush()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                vc.j0 r11 = vc.j0.this     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                android.content.Context r12 = vc.j0.l(r11)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                r11.G(r12, r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                r1.close()     // Catch: java.lang.Exception -> L83
                r3.close()     // Catch: java.lang.Exception -> L83
                goto L8e
            L60:
                r11 = move-exception
                goto L66
            L62:
                r11 = move-exception
                goto L6a
            L64:
                r11 = move-exception
                r3 = r0
            L66:
                r0 = r1
                goto L90
            L68:
                r11 = move-exception
                r3 = r0
            L6a:
                r0 = r1
                goto L71
            L6c:
                r11 = move-exception
                r3 = r0
                goto L90
            L6f:
                r11 = move-exception
                r3 = r0
            L71:
                r11.printStackTrace()     // Catch: java.lang.Throwable -> L8f
                vc.j0 r11 = vc.j0.this     // Catch: java.lang.Throwable -> L8f
                java.lang.String r12 = r10.f86005b     // Catch: java.lang.Throwable -> L8f
                xl.m r1 = r10.f86006c     // Catch: java.lang.Throwable -> L8f
                vc.j0.f(r11, r12, r1)     // Catch: java.lang.Throwable -> L8f
                if (r0 == 0) goto L85
                r0.close()     // Catch: java.lang.Exception -> L83
                goto L85
            L83:
                r11 = move-exception
                goto L8b
            L85:
                if (r3 == 0) goto L8e
                r3.close()     // Catch: java.lang.Exception -> L83
                goto L8e
            L8b:
                r11.printStackTrace()
            L8e:
                return
            L8f:
                r11 = move-exception
            L90:
                if (r0 == 0) goto L98
                r0.close()     // Catch: java.lang.Exception -> L96
                goto L98
            L96:
                r12 = move-exception
                goto L9e
            L98:
                if (r3 == 0) goto La1
                r3.close()     // Catch: java.lang.Exception -> L96
                goto La1
            L9e:
                r12.printStackTrace()
            La1:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: vc.j0.e.onResponse(okhttp3.Call, okhttp3.Response):void");
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public class f implements Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f86008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xl.m f86009c;

        public f(String str, xl.m mVar) {
            this.f86008b = str;
            this.f86009c = mVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            j0.this.C(this.f86008b, this.f86009c);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[Catch: Exception -> 0x00d3, TRY_LEAVE, TryCatch #7 {Exception -> 0x00d3, blocks: (B:46:0x00cf, B:50:0x00d7), top: B:57:0x00cf }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // okhttp3.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onResponse(okhttp3.Call r10, okhttp3.Response r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vc.j0.f.onResponse(okhttp3.Call, okhttp3.Response):void");
        }
    }

    /* JADX INFO: compiled from: UpdateUtil.java */
    public static class g implements HostnameVerifier {
        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        context.startActivity(intent);
    }

    public final void C(String str, xl.m<Integer> mVar) {
        new OkHttpClient().newCall(new Request.Builder().url(str).addHeader("RANGE", "bytes=" + this.f85981l + "-" + this.f85982m).build()).enqueue(new f(str, mVar));
    }

    public final File D() {
        File file = new File(Environment.getExternalStorageState().equals("mounted") ? BaseApplication.getInstance().getExternalFilesDir("").getAbsolutePath() : BaseApplication.getInstance().getFilesDir().getAbsolutePath(), "updatexiaocao.apk");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void E(String str, int i10) {
        if (zp.o.b(str)) {
            zp.p.b(zp.r.b().getResources().getString(R.string.str_download_tfail));
            return;
        }
        this.f85978i.setEnabled(false);
        this.f85977h.setEnabled(false);
        this.f85980k.setVisibility(8);
        this.f85978i.setVisibility(8);
        this.f85972c.setVisibility(0);
        this.f85973d.setVisibility(0);
        xl.k.create(new d(str)).subscribeOn(vm.a.b()).observeOn(am.a.a()).subscribe(new c(i10));
    }

    public void F(String str, xl.m<Integer> mVar) {
        new OkHttpClient().newCall(new Request.Builder().url(str).build()).enqueue(new e(str, mVar));
    }

    public void G(Context context, File file) {
        if (context == null) {
            return;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, BaseApplication.getInstance().getPackageName() + ".fileProvider", file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.addFlags(3);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        intent.setClipData(ClipData.newRawUri("output", uriForFile));
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public void H(Context context, Activity activity, boolean z10) {
        this.f85970a = context;
        this.f85985p = z10;
        xl.k.create(new b()).subscribeOn(vm.a.b()).observeOn(am.a.a()).subscribe(new a(z10, context));
    }
}
