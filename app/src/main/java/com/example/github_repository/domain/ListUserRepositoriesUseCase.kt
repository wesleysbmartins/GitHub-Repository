package com.example.github_repository.domain

import com.example.github_repository.core.UseCase
import com.example.github_repository.data.model.Repo
import com.example.github_repository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}