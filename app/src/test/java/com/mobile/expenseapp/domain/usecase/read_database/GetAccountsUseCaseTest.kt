package com.mobile.expenseapp.domain.usecase.read_database

import com.mobile.expenseapp.domain.repository.TransactionRepository
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

class GetAccountsUseCaseTest {

    private lateinit var transactionRepository: TransactionRepository
    private lateinit var getAccountsUseCase: GetAccountsUseCase

    @Before
    fun setUp() {
        transactionRepository = mock()
        getAccountsUseCase = GetAccountsUseCase(transactionRepository)
    }

    @Test
    fun `retrieves all account records from database`(): Unit = runBlocking {
        getAccountsUseCase()
        verify(transactionRepository, times(1)).getAccounts()
    }
}