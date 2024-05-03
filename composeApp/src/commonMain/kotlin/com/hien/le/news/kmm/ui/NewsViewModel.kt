package com.hien.le.news.kmm.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class NewsViewState(
    val showLoading: Boolean = true,
    val showError: Boolean = false,
    val newsItems: List<NewsItemUiState> = listOf(),
)

data class Source(
    val id: String?,
    val name: String?,
)

data class NewsItemUiState(
    val source: Source?,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?,
)

class NewsViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(NewsViewState())
    val uiState: StateFlow<NewsViewState> = _uiState.asStateFlow()

    init {
        getTopHeadlines()
    }

    private fun getTopHeadlines() {
        _uiState.update { currentState ->
            currentState.copy(
                showLoading = false,
                showError = false,
                newsItems = newsArticles,
            )
        }
    }
}

val newsArticles =
    listOf(
        NewsItemUiState(
            source = Source(id = "", name = "Biztoc.com"),
            author = "coingape.com",
            title = "Ethereum Founder Vitalik Buterin Reacts As Elon Musk Slams Microsoft",
            description = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
            url = "https://www.google.com/",
            urlToImage = "https://c.biztoc.com/p/89324d8b669c2591/s.webp",
            publishedAt = "2024-02-27T09:34:24Z",
            content = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "CNN"),
            author = "businessinsider.com",
            title = "Tesla's Optimus bot is looking a little steadier on its feet. Maybe the yoga stretches are paying off",
            description = "The prototype for Optimus was first revealed in September 2022. Tesla Optimus Elon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
            url = "https://www.youtube.com/",
            urlToImage = "https://c.biztoc.com/p/aca260fd8da1d159/s.webp",
            publishedAt = "2024-02-27T09:26:06Z",
            content = "The prototype for Optimus was first revealed in September 2022.Tesla OptimusElon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "Biztoc.com"),
            author = "coingape.com",
            title = "Ethereum Founder Vitalik Buterin Reacts As Elon Musk Slams Microsoft",
            description = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
            url = "https://biztoc.com/x/89324d8b669c2591",
            urlToImage = "https://c.biztoc.com/p/89324d8b669c2591/s.webp",
            publishedAt = "2024-02-27T09:34:24Z",
            content = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "CNN"),
            author = "businessinsider.com",
            title = "Tesla's Optimus bot is looking a little steadier on its feet. Maybe the yoga stretches are paying off",
            description = "The prototype for Optimus was first revealed in September 2022. Tesla Optimus Elon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
            url = "https://biztoc.com/x/aca260fd8da1d159",
            urlToImage = "https://c.biztoc.com/p/aca260fd8da1d159/s.webp",
            publishedAt = "2024-02-27T09:26:06Z",
            content = "The prototype for Optimus was first revealed in September 2022.Tesla OptimusElon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "Biztoc.com"),
            author = "coingape.com",
            title = "Ethereum Founder Vitalik Buterin Reacts As Elon Musk Slams Microsoft",
            description = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
            url = "https://biztoc.com/x/89324d8b669c2591",
            urlToImage = "https://c.biztoc.com/p/89324d8b669c2591/s.webp",
            publishedAt = "2024-02-27T09:34:24Z",
            content = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "CNN"),
            author = "businessinsider.com",
            title = "Tesla's Optimus bot is looking a little steadier on its feet. Maybe the yoga stretches are paying off",
            description = "The prototype for Optimus was first revealed in September 2022. Tesla Optimus Elon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
            url = "https://biztoc.com/x/aca260fd8da1d159",
            urlToImage = "https://c.biztoc.com/p/aca260fd8da1d159/s.webp",
            publishedAt = "2024-02-27T09:26:06Z",
            content = "The prototype for Optimus was first revealed in September 2022.Tesla OptimusElon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "Biztoc.com"),
            author = "coingape.com",
            title = "Ethereum Founder Vitalik Buterin Reacts As Elon Musk Slams Microsoft",
            description = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
            url = "https://biztoc.com/x/89324d8b669c2591",
            urlToImage = "https://c.biztoc.com/p/89324d8b669c2591/s.webp",
            publishedAt = "2024-02-27T09:34:24Z",
            content = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "CNN"),
            author = "businessinsider.com",
            title = "Tesla's Optimus bot is looking a little steadier on its feet. Maybe the yoga stretches are paying off",
            description = "The prototype for Optimus was first revealed in September 2022. Tesla Optimus Elon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
            url = "https://biztoc.com/x/aca260fd8da1d159",
            urlToImage = "https://c.biztoc.com/p/aca260fd8da1d159/s.webp",
            publishedAt = "2024-02-27T09:26:06Z",
            content = "The prototype for Optimus was first revealed in September 2022.Tesla OptimusElon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "Biztoc.com"),
            author = "coingape.com",
            title = "Ethereum Founder Vitalik Buterin Reacts As Elon Musk Slams Microsoft",
            description = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
            url = "https://biztoc.com/x/89324d8b669c2591",
            urlToImage = "https://c.biztoc.com/p/89324d8b669c2591/s.webp",
            publishedAt = "2024-02-27T09:34:24Z",
            content = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "CNN"),
            author = "businessinsider.com",
            title = "Tesla's Optimus bot is looking a little steadier on its feet. Maybe the yoga stretches are paying off",
            description = "The prototype for Optimus was first revealed in September 2022. Tesla Optimus Elon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
            url = "https://biztoc.com/x/aca260fd8da1d159",
            urlToImage = "https://c.biztoc.com/p/aca260fd8da1d159/s.webp",
            publishedAt = "2024-02-27T09:26:06Z",
            content = "The prototype for Optimus was first revealed in September 2022.Tesla OptimusElon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "Biztoc.com"),
            author = "coingape.com",
            title = "Ethereum Founder Vitalik Buterin Reacts As Elon Musk Slams Microsoft",
            description = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
            url = "https://biztoc.com/x/89324d8b669c2591",
            urlToImage = "https://c.biztoc.com/p/89324d8b669c2591/s.webp",
            publishedAt = "2024-02-27T09:34:24Z",
            content = "In a remarkable and unforeseen turn of events witnessed recently, Ethereum founder Vitalik Buterin invited Elon Musk, the founder of X Corp. and Tesla, to team up...",
        ),
        NewsItemUiState(
            source = Source(id = "", name = "CNN"),
            author = "businessinsider.com",
            title = "Tesla's Optimus bot is looking a little steadier on its feet. Maybe the yoga stretches are paying off",
            description = "The prototype for Optimus was first revealed in September 2022. Tesla Optimus Elon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
            url = "https://biztoc.com/x/aca260fd8da1d159",
            urlToImage = "https://c.biztoc.com/p/aca260fd8da1d159/s.webp",
            publishedAt = "2024-02-27T09:26:06Z",
            content = "The prototype for Optimus was first revealed in September 2022.Tesla OptimusElon Musk shared new footage of Tesla's humanoid robot, Optimus, in an X post on Saturday...",
        ),
        // Add more news articles here if needed
    )
