package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f84063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f84064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1049a f84065c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a$a, reason: collision with other inner class name */
    public interface InterfaceC1049a {
        void a(float f10);
    }

    public a(Handler handler, Context context, InterfaceC1049a interfaceC1049a) {
        super(handler);
        this.f84063a = -1.0f;
        this.f84064b = context.getApplicationContext();
        this.f84065c = interfaceC1049a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float streamVolume = ((AudioManager) this.f84064b.getSystemService("audio")) != null ? 100.0f * (r4.getStreamVolume(3) / r4.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.f84063a) {
            this.f84063a = streamVolume;
            sg.bigo.ads.common.t.a.a(0, 3, "AudioVolumeContentObserver", String.format("Volume change, current value: %s", Float.valueOf(streamVolume)));
            InterfaceC1049a interfaceC1049a = this.f84065c;
            if (interfaceC1049a != null) {
                interfaceC1049a.a(this.f84063a);
            }
        }
    }
}
