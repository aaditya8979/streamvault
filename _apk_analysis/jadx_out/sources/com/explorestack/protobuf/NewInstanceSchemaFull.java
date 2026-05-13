package com.explorestack.protobuf;

import com.explorestack.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes10.dex */
final class NewInstanceSchemaFull implements NewInstanceSchema {
    @Override // com.explorestack.protobuf.NewInstanceSchema
    public Object newInstance(Object obj) {
        return ((GeneratedMessageV3) obj).newInstance(GeneratedMessageV3.UnusedPrivateParameter.INSTANCE);
    }
}
