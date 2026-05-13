package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f18894c;

    public l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10) {
        this.f18894c = eventDispatcher;
        this.f18892a = i10;
        this.f18893b = j10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher.access$000(com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher):com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:80)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
        Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 25
        	at java.base/java.util.ArrayList.add(ArrayList.java:485)
        	at java.base/java.util.ArrayList.add(ArrayList.java:497)
        	at jadx.core.utils.ListUtils.safeReplace(ListUtils.java:123)
        	at jadx.core.dex.visitors.InlineMethods.replaceClsUsage(InlineMethods.java:191)
        	at jadx.core.dex.visitors.InlineMethods.lambda$updateUsageInfo$0(InlineMethods.java:183)
        	at jadx.core.dex.nodes.InsnNode.visitInsns(InsnNode.java:301)
        	at jadx.core.dex.visitors.InlineMethods.updateUsageInfo(InlineMethods.java:162)
        	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:93)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:78)
        	... 1 more
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher r0 = r4.f18894c
            com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener r0 = com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher.access$000(r0)
            int r1 = r4.f18892a
            long r2 = r4.f18893b
            r0.onDroppedFrames(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.l.run():void");
    }
}
