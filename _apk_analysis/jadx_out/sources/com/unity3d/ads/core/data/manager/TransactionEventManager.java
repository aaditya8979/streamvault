package com.unity3d.ads.core.data.manager;

import bn.r;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import go.l;
import go.v;
import hn.c;
import java.util.List;
import jn.d;
import jn.f;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import p000do.l0;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: TransactionEventManager.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TransactionEventManager {

    @NotNull
    public static final String BILLING_SERVICE_UNAVAILABLE = "Billing client is not available";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String INAPP = "inapp";

    @NotNull
    private static final String SUBS = "subs";

    @Nullable
    private final BillingClientAdapter billingClientAdapter;

    @NotNull
    private final GetTransactionData getTransactionData;

    @NotNull
    private final GetTransactionRequest getTransactionRequest;

    @NotNull
    private final ByteStringDataSource iapTransactionStore;

    @NotNull
    private final IsBillingClientAvailable isBillingClientAvailable;

    @NotNull
    private final Logger logger;

    @NotNull
    private final ProductDetailsFetcher productDetailsFetcher;

    @NotNull
    private final l0 scope;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: compiled from: TransactionEventManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: TransactionEventManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {163}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return TransactionEventManager.this.new AnonymousClass1(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            try {
            } catch (Exception e10) {
                TransactionEventManager.this.logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e10);
            }
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (!TransactionEventManager.this.billingClientAdapter.isInitialized()) {
                    final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                    this.L$0 = transactionEventManager;
                    this.label = 1;
                    final kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
                    cVar.K();
                    transactionEventManager.billingClientAdapter.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1

                        @NotNull
                        private final l<Boolean> hasBeenResumed = v.a(Boolean.FALSE);

                        private final void tryResume() {
                            Boolean value;
                            Boolean bool;
                            if (cVar.isActive()) {
                                l<Boolean> lVar = this.hasBeenResumed;
                                do {
                                    value = lVar.getValue();
                                    bool = value;
                                    bool.booleanValue();
                                } while (!lVar.b(value, Boolean.TRUE));
                                if (bool.booleanValue()) {
                                    return;
                                }
                                k<r> kVar = cVar;
                                Result.a aVar = Result.Companion;
                                kVar.resumeWith(Result.m7534constructorimpl(r.f5635a));
                            }
                        }

                        private final void tryResumeWithException(Exception exc) {
                            Boolean value;
                            Boolean bool;
                            if (cVar.isActive()) {
                                l<Boolean> lVar = this.hasBeenResumed;
                                do {
                                    value = lVar.getValue();
                                    bool = value;
                                    bool.booleanValue();
                                } while (!lVar.b(value, Boolean.TRUE));
                                if (bool.booleanValue()) {
                                    return;
                                }
                                k<r> kVar = cVar;
                                Result.a aVar = Result.Companion;
                                kVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(exc)));
                            }
                        }

                        @NotNull
                        public final l<Boolean> getHasBeenResumed() {
                            return this.hasBeenResumed;
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingServiceDisconnected() {
                            tryResumeWithException(new TransactionException("Billing service disconnected"));
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                        public void onBillingSetupFinished(@NotNull BillingResultBridge billingResultBridge) {
                            tn.p.k(billingResultBridge, "billingResult");
                            if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
                                tryResumeWithException(new TransactionException("Billing setup failed"));
                            } else {
                                tryResume();
                            }
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                        public void onIsAlreadyInitialized() {
                            tryResume();
                        }

                        @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                        public void onPurchaseUpdated(@NotNull BillingResultBridge billingResultBridge, @Nullable List<? extends PurchaseBridge> list) {
                            tn.p.k(billingResultBridge, "billingResult");
                            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                        }
                    });
                    Object objB = cVar.B();
                    if (objB == in.a.g()) {
                        f.c(this);
                    }
                    if (objB == objG) {
                        return objG;
                    }
                }
                return r.f5635a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (TransactionEventManager.this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
                BillingClientAdapter billingClientAdapter = TransactionEventManager.this.billingClientAdapter;
                final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
                billingClientAdapter.queryPurchasesAsync(TransactionEventManager.INAPP, new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$1(transactionEventManager2, billingResultBridge, list);
                    }
                });
                BillingClientAdapter billingClientAdapter2 = TransactionEventManager.this.billingClientAdapter;
                final TransactionEventManager transactionEventManager3 = TransactionEventManager.this;
                billingClientAdapter2.queryPurchasesAsync(TransactionEventManager.SUBS, new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.b
                    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                        TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                    }
                });
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransactionEventManager.kt */
    @d(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135, 148, 151}, m = "invokeSuspend")
    public static final class C44591 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ List<PurchaseBridge> $purchases;
        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C44591(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, c<? super C44591> cVar) {
            super(2, cVar);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
            this.$transactionOrigin = transactionOrigin;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new C44591(this.$purchases, this.this$0, this.$transactionOrigin, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((C44591) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(22:28|(1:30)|31|104|32|33|106|34|35|(1:37)(1:38)|(1:41)|(2:112|43)(1:46)|47|48|(1:51)|(2:(1:58)(1:57)|(2:61|(1:63)(4:64|110|65|(5:67|68|108|69|(1:71)(9:72|116|73|(0)|77|88|89|26|(6:90|(1:92)|93|(0)|99|100)(0)))(6:76|77|88|89|26|(0)(0)))))|81|120|82|89|26|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(5:67|68|108|69|(1:71)(9:72|116|73|(0)|77|88|89|26|(6:90|(1:92)|93|(0)|99|100)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01cd, code lost:
        
            r12 = r3;
            r11 = r13;
            r13 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01de, code lost:
        
            r6 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01e0, code lost:
        
            r6 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x01e1, code lost:
        
            r4 = r2;
            r2 = r3;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0180 A[Catch: Exception -> 0x01cc, TRY_LEAVE, TryCatch #3 {Exception -> 0x01cc, blocks: (B:65:0x0166, B:67:0x0180), top: B:110:0x0166 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01aa A[Catch: Exception -> 0x01e3, TryCatch #6 {Exception -> 0x01e3, blocks: (B:73:0x01a4, B:75:0x01aa, B:77:0x01c0), top: B:116:0x01a4 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01a0 -> B:116:0x01a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01bc -> B:77:0x01c0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01d2 -> B:89:0x01ef). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01e3 -> B:88:0x01ee). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 591
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C44591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TransactionEventManager(@NotNull l0 l0Var, @Nullable BillingClientAdapter billingClientAdapter, @NotNull GetTransactionData getTransactionData, @NotNull GetTransactionRequest getTransactionRequest, @NotNull TransactionEventRepository transactionEventRepository, @NotNull ByteStringDataSource byteStringDataSource, @NotNull IsBillingClientAvailable isBillingClientAvailable, @NotNull SessionRepository sessionRepository, @NotNull ProductDetailsFetcher productDetailsFetcher, @NotNull Logger logger) {
        tn.p.k(l0Var, "scope");
        tn.p.k(getTransactionData, "getTransactionData");
        tn.p.k(getTransactionRequest, "getTransactionRequest");
        tn.p.k(transactionEventRepository, "transactionEventRepository");
        tn.p.k(byteStringDataSource, "iapTransactionStore");
        tn.p.k(isBillingClientAvailable, "isBillingClientAvailable");
        tn.p.k(sessionRepository, "sessionRepository");
        tn.p.k(productDetailsFetcher, "productDetailsFetcher");
        tn.p.k(logger, "logger");
        this.scope = l0Var;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = byteStringDataSource;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            if ((list == null || list.isEmpty()) || this.billingClientAdapter == null) {
                return;
            }
            p000do.i.d(this.scope, null, null, new C44591(list, this, transactionOrigin, null), 3, null);
        }
    }

    public final void invoke() {
        if (!this.isBillingClientAvailable.invoke() || this.billingClientAdapter == null) {
            Logger.DefaultImpls.trace$default(this.logger, BILLING_SERVICE_UNAVAILABLE, null, 2, null);
        } else {
            p000do.i.d(this.scope, null, null, new AnonymousClass1(null), 3, null);
        }
    }
}
