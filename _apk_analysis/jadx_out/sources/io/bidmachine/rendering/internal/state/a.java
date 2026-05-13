package io.bidmachine.rendering.internal.state;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.state.a$a, reason: collision with other inner class name */
    public enum EnumC0839a {
        LoadingStarted,
        Loaded,
        FailedToLoad,
        ShowInitiated,
        Shown,
        FailedToShow,
        Clicked,
        Appeared,
        Disappeared,
        Finished,
        Expired,
        Destroyed
    }

    public interface b {
        void a(a aVar, EnumC0839a enumC0839a);
    }

    void a();

    void a(b bVar);

    boolean a(boolean z10);

    void b(b bVar);

    boolean b();

    boolean b(boolean z10);

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    void l();

    boolean m();
}
