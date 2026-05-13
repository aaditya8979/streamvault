package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import io.bidmachine.iab.vast.tags.VastTagName;
import yads.pj;

/* JADX INFO: loaded from: classes12.dex */
public final class pj implements bk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y43 f93601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y43 f93602b;

    public pj(final int i10) {
        this(new y43() { // from class: bt.f8
            @Override // yads.y43
            public final Object get() {
                return pj.a(i10);
            }
        }, new y43() { // from class: bt.g8
            @Override // yads.y43
            public final Object get() {
                return pj.b(i10);
            }
        });
    }

    public pj(y43 y43Var, y43 y43Var2) {
        this.f93601a = y43Var;
        this.f93602b = y43Var2;
    }

    public static HandlerThread a(int i10) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append(VastTagName.VIDEO);
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return new HandlerThread(sb2.toString());
    }

    public static HandlerThread b(int i10) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append(VastTagName.VIDEO);
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return new HandlerThread(sb2.toString());
    }

    @Override // yads.bk1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qj a(ak1 ak1Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        qj qjVar;
        String str = ak1Var.f87723a.f90861a;
        qj qjVar2 = null;
        try {
            d73.a("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                qjVar = new qj(mediaCodecCreateByCodecName, (HandlerThread) this.f93601a.get(), (HandlerThread) this.f93602b.get(), false);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                d73.a();
                qjVar.a(ak1Var.f87724b, ak1Var.f87726d, ak1Var.f87727e);
                return qjVar;
            } catch (Exception e11) {
                e = e11;
                qjVar2 = qjVar;
                if (qjVar2 != null) {
                    qjVar2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }
}
