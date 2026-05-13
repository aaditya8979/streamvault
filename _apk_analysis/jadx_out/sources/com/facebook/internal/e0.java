package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Ne;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformServiceClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u00002\u00020\u0001:\u0001\u0019B9\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020*\u0012\u0006\u00105\u001a\u00020*\u0012\u0006\u00103\u001a\u000200\u0012\b\u00109\u001a\u0004\u0018\u000100¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH$J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002R\u001a\u0010\u001d\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u0019\u00109\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/facebook/internal/e0;", "Landroid/content/ServiceConnection;", "Lcom/facebook/internal/e0$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lbn/r;", "q", "", "r", InneractiveMediationDefs.GENDER_MALE, "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "onServiceConnected", "onServiceDisconnected", "Landroid/os/Bundle;", "data", "o", "Landroid/os/Message;", "message", "n", "p", "result", "d", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "handler", "Lcom/facebook/internal/e0$b;", "e", "Z", "running", "Landroid/os/Messenger;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/os/Messenger;", NotificationCompat.MessagingStyle.Message.KEY_SENDER, "", "g", "I", "requestMessage", "h", "replyMessage", "", "i", "Ljava/lang/String;", "applicationId", "j", Ne.f29940j2, CampaignEx.JSON_KEY_AD_K, "getNonce", "()Ljava/lang/String;", "nonce", "<init>", "(Landroid/content/Context;IIILjava/lang/String;Ljava/lang/String;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class e0 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean running;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Messenger sender;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int requestMessage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int replyMessage;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String applicationId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int protocolVersion;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String nonce;

    /* JADX INFO: compiled from: PlatformServiceClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/facebook/internal/e0$a", "Landroid/os/Handler;", "Landroid/os/Message;", "message", "Lbn/r;", "handleMessage", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            if (c3.a.d(this)) {
                return;
            }
            try {
                if (c3.a.d(this)) {
                    return;
                }
                try {
                    tn.p.k(message, "message");
                    e0.this.n(message);
                } catch (Throwable th2) {
                    c3.a.b(th2, this);
                }
            } catch (Throwable th3) {
                c3.a.b(th3, this);
            }
        }
    }

    /* JADX INFO: compiled from: PlatformServiceClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/e0$b;", "", "Landroid/os/Bundle;", "result", "Lbn/r;", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface b {
        void a(@Nullable Bundle bundle);
    }

    public e0(@NotNull Context context, int i10, int i11, int i12, @NotNull String str, @Nullable String str2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext != null ? applicationContext : context;
        this.requestMessage = i10;
        this.replyMessage = i11;
        this.applicationId = str;
        this.protocolVersion = i12;
        this.nonce = str2;
        this.handler = new a();
    }

    public final void d(Bundle bundle) {
        if (this.running) {
            this.running = false;
            b bVar = this.listener;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void m() {
        this.running = false;
    }

    public final void n(@NotNull Message message) {
        tn.p.k(message, "message");
        if (message.what == this.replyMessage) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                d(null);
            } else {
                d(data);
            }
            try {
                this.context.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public abstract void o(@NotNull Bundle bundle);

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder iBinder) {
        tn.p.k(componentName, "name");
        tn.p.k(iBinder, NotificationCompat.CATEGORY_SERVICE);
        this.sender = new Messenger(iBinder);
        p();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        tn.p.k(componentName, "name");
        this.sender = null;
        try {
            this.context.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        d(null);
    }

    public final void p() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.applicationId);
        String str = this.nonce;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        o(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.requestMessage);
        messageObtain.arg1 = this.protocolVersion;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.handler);
        try {
            Messenger messenger = this.sender;
            if (messenger == null) {
                return;
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            d(null);
        }
    }

    public final void q(@Nullable b bVar) {
        this.listener = bVar;
    }

    public final boolean r() {
        synchronized (this) {
            boolean z10 = false;
            if (this.running) {
                return false;
            }
            d0 d0Var = d0.f15326a;
            if (d0.t(this.protocolVersion) == -1) {
                return false;
            }
            Intent intentL = d0.l(getContext());
            if (intentL != null) {
                this.running = true;
                getContext().bindService(intentL, this, 1);
                z10 = true;
            }
            return z10;
        }
    }
}
