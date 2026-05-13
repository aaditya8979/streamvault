package r0;

import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CastInterface.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f78539a = new m();

    @Override // r0.b
    public void a(@NotNull String str, @Nullable p<bn.r> pVar) {
        tn.p.k(str, "speed");
    }

    @Override // r0.b
    public void b(@Nullable p<bn.r> pVar) {
    }

    @Override // r0.b
    public void c(@NotNull String str, @NotNull String str2, @Nullable p<bn.r> pVar) {
        tn.p.k(str, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        tn.p.k(str2, "title");
    }
}
