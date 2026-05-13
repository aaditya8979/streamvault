package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: RankTopicEntry.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RankTopicEntry {

    @NotNull
    private final List<TopicPidList> pid_list;

    @NotNull
    private final List<SpecialList> topic_list;

    public RankTopicEntry(@NotNull List<TopicPidList> list, @NotNull List<SpecialList> list2) {
        p.k(list, "pid_list");
        p.k(list2, "topic_list");
        this.pid_list = list;
        this.topic_list = list2;
    }

    @NotNull
    public final List<TopicPidList> getPid_list() {
        return this.pid_list;
    }

    @NotNull
    public final List<SpecialList> getTopic_list() {
        return this.topic_list;
    }
}
