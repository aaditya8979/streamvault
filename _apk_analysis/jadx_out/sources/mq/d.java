package mq;

/* JADX INFO: compiled from: Authentication.java */
/* JADX INFO: loaded from: classes10.dex */
public interface d {
    public static final d I8 = new a();
    public static final d J8 = new b();
    public static final d K8 = new c();
    public static final d L8 = new C0891d();
    public static final d M8 = new e();

    /* JADX INFO: compiled from: Authentication.java */
    public static class a implements d {
        public String toString() {
            return "UNAUTHENTICATED";
        }
    }

    /* JADX INFO: compiled from: Authentication.java */
    public static class b implements d {
        public String toString() {
            return "NOT CHECKED";
        }
    }

    /* JADX INFO: compiled from: Authentication.java */
    public static class c implements g {
        public String toString() {
            return "CHALLENGE";
        }
    }

    /* JADX INFO: renamed from: mq.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Authentication.java */
    public static class C0891d implements g {
        public String toString() {
            return "FAILURE";
        }
    }

    /* JADX INFO: compiled from: Authentication.java */
    public static class e implements g {
        public String toString() {
            return "SEND_SUCCESS";
        }
    }

    /* JADX INFO: compiled from: Authentication.java */
    public interface f extends d {
        d e(zm.p pVar);
    }

    /* JADX INFO: compiled from: Authentication.java */
    public interface g extends d {
    }

    /* JADX INFO: compiled from: Authentication.java */
    public interface h extends d {
        String getAuthMethod();

        v getUserIdentity();
    }

    /* JADX INFO: compiled from: Authentication.java */
    public interface i extends d {
        an.a g();

        an.c o();
    }
}
