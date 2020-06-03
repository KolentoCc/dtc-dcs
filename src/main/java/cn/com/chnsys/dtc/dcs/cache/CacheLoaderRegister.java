package cn.com.chnsys.dtc.dcs.cache;

import java.util.Map;

import org.springframework.beans.factory.InitializingBean;

import cn.com.chnsys.dtc.cache.Cache;
import cn.com.chnsys.dtc.cache.CacheContext;

/**
 * 
 * @author CUICHENG 
 * @Description: 缓存注册
 * @date 2016年8月26日 下午5:57:48
 */
public class CacheLoaderRegister implements InitializingBean {
    private CacheContext cacheContext;
    private Map<String, Cache> caches;

    @Override
    public void afterPropertiesSet() throws Exception {
		if (caches != null && caches.size() > 0) {
		    for (String loader : caches.keySet())
			cacheContext.addCache(loader, caches.get(loader));
		}
    }

    public CacheContext getCacheContext() {
        return cacheContext;
    }

    public void setCacheContext(CacheContext cacheContext) {
        this.cacheContext = cacheContext;
    }

    public Map<String, Cache> getCaches() {
        return caches;
    }

    public void setCaches(Map<String, Cache> caches) {
        this.caches = caches;
    }
}
