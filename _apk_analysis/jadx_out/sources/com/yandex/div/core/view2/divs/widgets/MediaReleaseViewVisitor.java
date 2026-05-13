package com.yandex.div.core.view2.divs.widgets;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MediaReleaseViewVisitor.kt */
/* JADX INFO: loaded from: classes10.dex */
public class MediaReleaseViewVisitor extends DivViewVisitor {
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivGifImageView divGifImageView) {
        divGifImageView.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivImageView divImageView) {
        divImageView.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivVideoView divVideoView) {
        divVideoView.release();
    }
}
