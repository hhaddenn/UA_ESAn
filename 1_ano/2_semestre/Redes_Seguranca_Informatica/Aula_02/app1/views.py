from django.shortcuts import render, HttpResponse

from app1.forms import TarefaForm
from .models import Tarefa

# Create your views here.
def home(request):
    tarefas = Tarefa.objects.all()
    form = TarefaForm()


    if request.method == 'POST':
        form = TarefaForm(request.POST)
        if form.is_valid():
            form.save()
        else:
            return HttpResponse('Formulário inválido')


    return render(request, 'home.html', {'lista': tarefas, 'form': form})
