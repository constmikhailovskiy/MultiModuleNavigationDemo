package com.betterme.uicore

abstract class BasePresenter<V : BaseView> {

    protected var view: V? = null

    open fun bind(view: V) {
        this.view = view
    }

    open fun unbind() {
        this.view = null
    }
}