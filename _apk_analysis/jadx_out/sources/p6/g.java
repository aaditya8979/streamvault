package p6;

import i6.z;

/* JADX INFO: compiled from: Seeker.java */
/* JADX INFO: loaded from: classes12.dex */
public interface g extends z {

    /* JADX INFO: compiled from: Seeker.java */
    public static class a extends z.b implements g {
        public a() {
            super(-9223372036854775807L);
        }

        @Override // p6.g
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // p6.g
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    long getDataEndPosition();

    long getTimeUs(long j10);
}
