package domain.usecase

import core.sealed.GenericState
import domain.repository.FinanceRepository
import kotlinx.datetime.LocalDateTime

class GetMonthsUseCase(
    private val financeRepository: FinanceRepository
) {
    suspend fun getMonths(): GenericState<Map<Int, List<LocalDateTime>>> =
        financeRepository.getMonths()
}
