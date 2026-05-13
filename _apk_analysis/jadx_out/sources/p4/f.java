package p4;

import k4.s;

/* JADX INFO: compiled from: Seeker.java */
/* JADX INFO: loaded from: classes9.dex */
public interface f extends s {

    /* JADX INFO: compiled from: Seeker.java */
    public static class a extends s.b implements f {
        public a() {
            super(-9223372036854775807L);
        }

        @Override // p4.f
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // p4.f
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    long getDataEndPosition();

    long getTimeUs(long j10);
}
