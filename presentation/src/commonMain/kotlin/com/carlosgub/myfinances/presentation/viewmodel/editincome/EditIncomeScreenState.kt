package com.carlosgub.myfinances.presentation.viewmodel.editincome

import com.carlosgub.myfinances.core.utils.toMoneyFormat
import com.carlosgub.myfinances.domain.model.CategoryEnum

data class EditIncomeScreenState(
    val category: com.carlosgub.myfinances.domain.model.CategoryEnum = com.carlosgub.myfinances.domain.model.CategoryEnum.WORK,
    val amountField: String = 0.0.toMoneyFormat(),
    val amount: Double = 0.0,
    val showDateError: Boolean = false,
    val showNoteError: Boolean = false,
    val showError: Boolean = false,
    val note: String = "",
    val date: String = "",
    val dateInMillis: Long = 0L,
    val initialDataLoaded: Boolean = false,
    val showLoading: Boolean = false,
    val id: Long = 0L,
    val monthKey: String = "",
)