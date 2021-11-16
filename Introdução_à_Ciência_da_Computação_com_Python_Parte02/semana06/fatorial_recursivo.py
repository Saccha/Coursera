def fatorial(n: int) -> int:
    """Fatorial utilizando chamadas recursivas."""
    return 1 if n < 1 else n * fatorial(n-1)
