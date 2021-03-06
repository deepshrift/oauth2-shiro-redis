/*
 * Copyright (c) 2015 MONKEYK Information Technology Co. Ltd
 * www.monkeyk.com
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * MONKEYK Information Technology Co. Ltd ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with MONKEYK Information Technology Co. Ltd.
 */
package com.monkeyk.os.service.business;

import com.monkeyk.os.domain.oauth.OauthCacheRepository;
import com.monkeyk.os.domain.shared.BeanProvider;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.shiro.SecurityUtils;

/**
 * 2015/10/22
 *
 * @author Shengzhao Li
 */
public abstract class AbstractOAuthHolder {


//    protected transient OauthRepository oauthRepository = BeanProvider.getBean(OauthRepository.class);

    protected transient OauthCacheRepository oauthRepository = BeanProvider.getBean(OauthCacheRepository.class);


    protected transient OAuthIssuer oAuthIssuer = BeanProvider.getBean(OAuthIssuer.class);

    /**
     * Return current login username
     *
     * @return Username
     */
    protected String currentUsername() {
        return (String) SecurityUtils.getSubject().getPrincipal();
    }

}
