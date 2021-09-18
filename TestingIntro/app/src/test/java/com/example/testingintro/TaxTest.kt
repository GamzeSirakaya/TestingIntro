package com.example.testingintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class TaxTest {
    private lateinit var tax: Tax

    @Before
    fun setup() {
        tax = Tax()
    }

    @After
    fun tearDown() {

    }

    @Test
    fun calculateTax() {

        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateInCome() {
        val netIncome = tax.calculateInCome(200.0, 0.2)
        assertThat(netIncome).isEqualTo(160)
    }
}