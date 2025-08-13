import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-verperfil')
export class VistaVerperfil extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout3">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 50%;">
   <vaadin-button id="foto" style="width: 50%; height: 20%; align-self: center; margin: var(--lumo-space-xl);" tabindex="0">
     Foto 
   </vaadin-button>
   <vaadin-text-field id="nombre" style="align-self: center;" readonly value="Nombre" type="text"></vaadin-text-field>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 100%; height: 40%;"></vaadin-vertical-layout>
   <vaadin-button id="inicio" style="align-self: center; width: 25%; height: 10%;" tabindex="0">
     Inicio 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
    <vaadin-button id="seguidores" tabindex="0">
      Seguidores 
    </vaadin-button>
    <vaadin-text-field id="numSeguidores" style="width: 30%;" type="text" readonly value="99999"></vaadin-text-field>
    <vaadin-vertical-layout id="vaadinVerticalLayout" style="height: 1%; width: 10%;"></vaadin-vertical-layout>
    <vaadin-button id="seguir" tabindex="0">
      Seguir 
    </vaadin-button>
    <vaadin-button id="noSeguir" tabindex="0">
      Dejar De Seguir 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
    <vaadin-button id="seguidos" tabindex="0">
      Seguidos 
    </vaadin-button>
    <vaadin-text-field style="width: 30%;" type="text" readonly value="99999" id="numSeguidos"></vaadin-text-field>
    <vaadin-vertical-layout id="vaadinVerticalLayout" style="height: 1%; width: 10%;"></vaadin-vertical-layout>
    <vaadin-button id="editar" tabindex="0">
      Editar 
    </vaadin-button>
    <vaadin-button id="bloquear" tabindex="0">
      Bloquear 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout id="vaadinHorizontalLayout4" style="width: 100%;">
    <vaadin-button id="tweets1" style="align-self: center; flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);" tabindex="0">
      Tweets 
    </vaadin-button>
    <vaadin-button id="retweets" style="align-self: center; flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);" tabindex="0">
      Retweets 
    </vaadin-button>
    <vaadin-button id="meGustas" style="align-self: center; flex-grow: 1; margin-left: var(--lumo-space-xl); margin-right: var(--lumo-space-xl);" tabindex="0">
      Me Gustas 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout id="tweets" style="width: 100%; height: 100%; padding: var(--lumo-space-m); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-s);"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
