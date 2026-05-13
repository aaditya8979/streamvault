package com.yandex.div.core.player;

import cn.f0;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div2.DivVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivVideoViewMapper.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivVideoViewMapper {

    @NotNull
    private final WeakHashMap<DivVideoView, DivVideo> currentViews = new WeakHashMap<>();

    public final void addView(@NotNull DivVideoView divVideoView, @NotNull DivVideo divVideo) {
        this.currentViews.put(divVideoView, divVideo);
    }

    @Nullable
    public final DivPlayer getPlayer(@NotNull DivVideo divVideo) {
        Set<Map.Entry<DivVideoView, DivVideo>> setEntrySet = this.currentViews.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (p.f(entry.getValue(), divVideo) || p.f(((DivVideo) entry.getValue()).getId(), divVideo.getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DivPlayerView playerView = ((DivVideoView) ((Map.Entry) it.next()).getKey()).getPlayerView();
            DivPlayer attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        return (DivPlayer) f0.v0(arrayList2);
    }
}
